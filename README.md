# GONTOBBO  

**GONTOBBO** is a Java-based, platform-independent Ticket Management System designed to streamline ticket sales, refunds, and management. With a clean, user-friendly interface, robust functionality, and an integrated SQLite database, it is a reliable solution for businesses looking to efficiently handle ticket transactions.  

---

## Features  

### Admin  
- **User Authentication:** Secure admin login.  
- **Sales Insights:** Real-time display of total sales at the top of the dashboard.  

### Receptionist  
- **Ticket Management:**  
  - Sell new tickets.  
  - Process ticket refunds.  
- **History Overview:**  
  - View old tickets stored in the database.  
- **Sales Overview:**  
  - Check total sales data.  

### General  
- **Platform Independent:** Built using Java Swing, runs on any system with a Java runtime environment.  
- **Database Integration:** SQLite used for reliable and lightweight data storage.  
- **Object-Oriented Design:** Ensures clean code and extensibility.  

---

## Technology Stack  

- **Programming Language:** Java  
- **UI Framework:** Java Swing  
- **Database:** SQLite  
- **Architecture:** Object-Oriented Programming (OOP)  

---

## Installation  

### Prerequisites  
1. Java Development Kit (JDK) version 8 or higher installed on your machine.  
2. SQLite installed for database management.  
3. Git installed for cloning the repository.  

### Steps  
1. Clone the repository:  
   ```bash  
   git clone https://github.com/<your-username>/GONTOBBO.git  
   ```  

2. Navigate to the project directory:  
   ```bash  
   cd GONTOBBO  
   ```  

3. Set up the SQLite database:  
   - Ensure the `gontobbo.db` file is present in the `resources` folder.  
   - If missing, create a new SQLite database and run the schema provided in `database/schema.sql`.  
     ```bash  
     sqlite3 gontobbo.db < database/schema.sql  
     ```  

4. Compile the project:  
   ```bash  
   javac -d bin src/*.java  
   ```  

5. Run the application:  
   ```bash  
   java -cp bin Main  
   ```  

---

## Screenshots  

![image](https://github.com/user-attachments/assets/d0ea72b6-8131-4a83-9759-2595e569fe06)
###Home Page
![image](https://github.com/user-attachments/assets/2934d6cb-c137-49f8-ba32-4b59ad955f1d)
###Sale Form
![image](https://github.com/user-attachments/assets/f5ce2478-51b7-4ccb-acbd-f627e493a71c)
###Admin Dashboard

##[More Images](https://github.com/rahatcodes/gontobbo/tree/main/Images)

---

## Contribution  

We welcome contributions! Here's how you can help:  

1. Fork the repository.  
2. Create a feature branch:  
   ```bash  
   git checkout -b feature-name  
   ```  
3. Commit your changes:  
   ```bash  
   git commit -m "Add your message here"  
   ```  
4. Push to the branch:  
   ```bash  
   git push origin feature-name  
   ```  
5. Submit a pull request.  

---

## License  

This project is licensed under the [MIT License](LICENSE).  

---


**GONTOBBO** - Simplifying Ticket Management, One Transaction at a Time.
```  

This version includes instructions on setting up and integrating SQLite with the project. If you have specific schemas or additional details about the database, let me know, and I can add those too!
