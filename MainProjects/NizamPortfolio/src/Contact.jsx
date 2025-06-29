import React, { useRef } from "react";
import emailjs from "emailjs-com";

function Contact() {
  const form = useRef();

  const sendEmail = (e) => {
    e.preventDefault();
    emailjs.sendForm('service_k5ckykj', 'template_kqtxkti', form.current, 'Mn4W1R516uhM2-CTM')
      .then(() => alert('Message sent!'), (error) => alert(error.text));
  };

  return (
    <div className="about">
      <h2 className="">Contact Me</h2>
      <form ref={form} onSubmit={sendEmail} className="">
        <input name="name" type="text" placeholder="Your Name" className="" required />
        <input name="email" type="email" placeholder="Your Email" className="" required />
        <textarea name="message" placeholder="Your Message" className="" rows="4" required></textarea>
        <button type="submit" className="">Send</button>
      </form>
    </div>
  );
}

export default Contact;
