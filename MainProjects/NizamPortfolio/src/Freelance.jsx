import React, { useRef, useState } from 'react';
import './css/Freelance.css';
import emailjs from 'emailjs-com';

function Freelance() {
  const form = useRef();
  const [type, setType] = useState('');
  const [pages, setPages] = useState(1);
  const [price, setPrice] = useState(0);

  const calculatePrice = (type, pages) => {
    let base = 0, perPage = 0, included = 0;

    switch (type) {
      case 'Portfolio': base = 1000; perPage = 200; included = 1; break;
      case 'Business': base = 1500; perPage = 300; included = 3; break;
      case 'E-commerce': base = 2500; perPage = 500; included = 5; break;
      case 'Blog': base = 1200; perPage = 250; included = 2; break;
      default: return 0;
    }

    const extraPages = Math.max(0, pages - included);
    return base + (extraPages * perPage);
  };

  const updatePrice = (type, pages) => {
    const cost = calculatePrice(type, pages);
    setPrice(cost);
  };

  const handleTypeChange = (e) => {
    const value = e.target.value;
    setType(value);
    updatePrice(value, pages);
  };

  const handlePagesChange = (e) => {
    const value = parseInt(e.target.value) || 1;
    setPages(value);
    updatePrice(type, value);
  };

  const loadRazorpayScript = () => {
    return new Promise((resolve) => {
      const script = document.createElement('script');
      script.src = 'https://checkout.razorpay.com/v1/checkout.js';
      script.onload = () => resolve(true);
      script.onerror = () => resolve(false);
      document.body.appendChild(script);
    });
  };

  const handlePayment = async (e) => {
    e.preventDefault();

    const res = await loadRazorpayScript();
    if (!res) {
      alert("Failed to load Razorpay SDK.");
      return;
    }

    const options = {
      key: "rzp_test_2W1AZgwdOcsoAb",
      amount: price * 100,
      currency: "INR",
      name: "Nizamuddin Ali",
      description: `Website Order - ${type}`,
      handler: function (response) {
        alert("Payment successful! ID: " + response.razorpay_payment_id);
        emailjs.sendForm('service_k5ckykj', 'template_3580ikc', form.current, 'Mn4W1R516uhM2-CTM');
      },
      prefill: {
        name: form.current.name.value,
        email: form.current.email.value,
      },
      theme: {
        color: "#007bff",
      },
    };

    const rzp = new window.Razorpay(options);
    rzp.open();
  };

  return (
    <div className="freelance">
      <h2 className="freelance-title">Order a Custom Website</h2>
      <form ref={form} onSubmit={handlePayment} className="freelance-form">
        <div className="formgridp">
          <div className="formgridc">
            <label>Name</label>
            <input name="name" type="text" placeholder="Your Name" required />
          </div>
          <div className="formgridc">
            <label>Email</label>
            <input name="email" type="email" placeholder="Your Email" required />
          </div>
          <div className="formgridc">
            <label>Website Type</label>
            <select name="type" value={type} onChange={handleTypeChange} required>
              <option value="">Select Type</option>
              <option value="Portfolio">Portfolio</option>
              <option value="Business">Business</option>
              <option value="E-commerce">E-commerce</option>
              <option value="Blog">Blog</option>
            </select>
          </div>
          <div className="formgridc">
            <label>Number of Pages</label>
            <input
              name="pages"
              type="number"
              min="1"
              max="20"
              value={pages || 1}
              onChange={handlePagesChange}
              required
            />
            <input
              name="message"
              type="hidden"
              value='order placed by user'
              disabled
            />
          </div>
          <div className="formgridc" >
            <label>Project Details</label>
            <textarea name="details" placeholder="Describe your idea..." rows="" required />
          </div>
          <div className="formgridc" >
            <p className="freelance-price">Estimated Price: ₹{price}</p>
            <button type="submit" className="freelance-button">Pay & Order</button>
          </div>
        </div>
      </form>
    </div>
  );
}

export default Freelance;
