# Twitter-like Backend Service

A robust RESTful API backend for a Twitter-like social media platform, built with Spring Boot. This project provides essential features such as user authentication, post management, social interactions, and more.

## ✨ Features

- **User Authentication & Authorization**
  - Secure registration/login with Spring Security.
  - Role-based access control (e.g., user/admin permissions).
- **Post Management**
  - Create, edit, delete, and fetch posts.
  - Pagination and filtering for post feeds.
- **Social Features**
  - Follow/unfollow users.
  - Comment on posts.
  - Like/unlike posts.
- **Database Migrations**
  - Version-controlled schema changes via **Liquibase**.
- **Additional Features**
  - User profile management.
  - Real-time notifications (WIP).

## 🛠️ Tech Stack

- **Backend**: Spring Boot 3.x
- **Database**: MySQL (with H2 for local testing)
- **ORM**: Spring Data JPA
- **Security**: Spring Security (JWT-based authentication)
- **Migrations**: Liquibase
- **Build Tool**: Maven
- **Version Control**: GitHub

## 🚀 Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/twitter-like-backend.git
