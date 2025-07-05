import React, { useRef } from "react";
import emailjs from "emailjs-com";
import './css/Contact.css';

function Contact() {
  const form = useRef();

  const sendEmail = (e) => {
    e.preventDefault();
    emailjs
      .sendForm('service_k5ckykj', 'template_kqtxkti', form.current, 'Mn4W1R516uhM2-CTM')
      .then(() => alert('Message sent!'), (error) => alert(error.text));
  };

  return (
    <div className="contact">
      <h2 className="contact-title">Contact Me</h2>
      <form ref={form} onSubmit={sendEmail} className="contact-form">
        <label htmlFor="name">Name</label>
        <input name="name" type="text" placeholder="Your Name" className="contact-input" required />

        <label htmlFor="email">Email</label>
        <input name="email" type="email" placeholder="Your Email" className="contact-input" required />

        <label htmlFor="message">Message</label>
        <textarea name="message" placeholder="Your Message" className="contact-textarea" rows="4" required></textarea>

        <button type="submit" className="contact-button">Send</button>
      </form>
    </div>
  );
}

export default Contact;
