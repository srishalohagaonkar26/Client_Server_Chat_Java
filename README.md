# Client-Server Chat Application (Java Sockets)

A multithreaded chat application built using Java Socket Programming, where multiple clients can connect to a server, chat using usernames, and get notified when someone joins or leaves.

## 🛠️ Tech Stack
- Java
- Socket Programming (TCP/IP)
- Multithreading (Thread class)

## 📌 Features
- Server can accept multiple clients simultaneously using a separate thread per client
- Each client identifies themselves with a username
- Join and leave notifications shown on the server console
- Real-time two-way message exchange between client and server

## 🚀 How to Run

1. Compile all files:
2. Run the server:
3. In a separate terminal, run the client:
4. Enter an username when prompted, then start chatting!

## 📖 What I Learned
- Multithreading in Java using `extends Thread` and overriding `run()`
- Difference between `implements` (interface contract) and `extends` (inheritance)
- Why `.start()` is used instead of directly calling `.run()`
- Handling multiple socket connections on a server without blocking
- Structuring client-server communication order (e.g., reading a username before starting the main chat loop)

## 👤 Author
Srisha Lohagaonkar