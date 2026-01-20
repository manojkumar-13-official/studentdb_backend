@echo off
echo Starting Student Management System...
echo.

echo Starting Backend (Spring Boot)...
start "Backend" cmd /k "mvn spring-boot:run"

timeout /t 5 /nobreak > nul

echo Starting Frontend (React)...
start "Frontend" cmd /k "cd frontend && npm start"

echo.
echo Both servers are starting...
echo Backend will be available at: http://localhost:8081
echo Frontend will be available at: http://localhost:3000
echo.
echo Press any key to exit...
pause > nul
