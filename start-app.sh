#!/bin/bash

echo "Starting Student Management System..."
echo

echo "Starting Backend (Spring Boot)..."
gnome-terminal -- bash -c "mvn spring-boot:run; exec bash" &

sleep 5

echo "Starting Frontend (React)..."
gnome-terminal -- bash -c "cd frontend && npm start; exec bash" &

echo
echo "Both servers are starting..."
echo "Backend will be available at: http://localhost:8081"
echo "Frontend will be available at: http://localhost:3000"
echo
echo "Press any key to exit..."
read -n 1
