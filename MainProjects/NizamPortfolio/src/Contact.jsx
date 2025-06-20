import React, { useRef } from "react";
import emailjs from "emailjs-com";

function Contact() {
  const form = useRef();

  const sendEmail = (e) => {
    e.preventDefault();
    emailjs.sendForm('YOUR_SERVICE_ID', 'YOUR_TEMPLATE_ID', form.current, 'YOUR_USER_ID')
      .then(() => alert('Message sent!'), (error) => alert(error.text));
  };

  return (
    <div className="p-6">
      <h2 className="text-3xl font-bold mb-4">Contact Me</h2>
      <form ref={form} onSubmit={sendEmail} className="max-w-md space-y-4">
        <input name="name" type="text" placeholder="Your Name" className="w-full p-2 border rounded" required />
        <input name="email" type="email" placeholder="Your Email" className="w-full p-2 border rounded" required />
        <textarea name="message" placeholder="Your Message" className="w-full p-2 border rounded" rows="4" required></textarea>
        <button type="submit" className="bg-blue-600 text-white px-4 py-2 rounded">Send</button>
      </form>
    </div>
  );
}

export default Contact;
