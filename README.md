# Student Management System

A full-stack web application for managing student records with Spring Boot backend and React frontend.

## Features

- **Create**: Add new students with validation
- **Read**: View all students in a responsive table
- **Update**: Edit existing student information
- **Delete**: Remove students with confirmation
- **Responsive Design**: Works on desktop and mobile devices
- **Real-time Updates**: Changes reflect immediately in the database

## Tech Stack

### Backend
- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- MySQL Database
- Maven

### Frontend
- React 18
- Axios for API calls
- CSS3 with modern styling
- Responsive design

## Prerequisites

- Java 17 or higher
- Node.js 16 or higher
- MySQL 8.0 or higher
- Maven 3.6 or higher

## Setup Instructions

### 1. Database Setup

1. Create a MySQL database named `student_db`
2. Update the database credentials in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

### 2. Backend Setup

1. Navigate to the project root directory
2. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
   Or if you have Maven wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```

The backend will start on `http://localhost:8081`

### 3. Frontend Setup

1. Navigate to the frontend directory:
   ```bash
   cd frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the React development server:
   ```bash
   npm start
   ```

The frontend will start on `http://localhost:3000`

## API Endpoints

The backend provides the following REST API endpoints:

- `GET /api/student` - Get all students
- `GET /api/student/{id}` - Get student by ID
- `POST /api/student` - Create new student
- `PUT /api/student/{id}` - Update student
- `DELETE /api/student/{id}` - Delete student

## Usage

1. Open your browser and go to `http://localhost:3000`
2. Click "Add New Student" to create a new student record
3. Fill in the required fields:
   - Student Name
   - Student Email
   - Student Year
   - Student Department
4. Click "Add Student" to save
5. Use "Edit" button to modify existing records
6. Use "Delete" button to remove records (with confirmation)

## Project Structure

```
backend_crudapp/
├── src/main/java/com/example/backend_crudapp/
│   ├── controller/StudentController.java
│   ├── model/Student.java
│   ├── repository/StudentRepo.java
│   └── service/StudentService.java
├── src/main/resources/
│   └── application.properties
└── frontend/
    ├── src/
    │   ├── components/
    │   │   ├── StudentForm.js
    │   │   └── StudentList.js
    │   ├── services/
    │   │   └── api.js
    │   ├── App.js
    │   ├── App.css
    │   ├── index.js
    │   └── index.css
    └── package.json
```

## Troubleshooting

### Common Issues

1. **Database Connection Error**: 
   - Ensure MySQL is running
   - Check database credentials in `application.properties`
   - Verify database `student_db` exists

2. **CORS Issues**:
   - The frontend is configured to proxy requests to the backend
   - Ensure backend is running on port 8081

3. **Port Conflicts**:
   - Backend runs on port 8081
   - Frontend runs on port 3000
   - Change ports in respective configuration files if needed

### Development Tips

- Use browser developer tools to debug API calls
- Check browser console for JavaScript errors
- Monitor backend logs for server-side issues
- Use Postman or similar tools to test API endpoints directly

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## License

This project is open source and available under the MIT License.
