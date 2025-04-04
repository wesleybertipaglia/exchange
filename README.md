# Currency Converter

A simple currency converter built in Java using the `java.net.http` package and the [ExchangeRate API](https://www.exchangerate-api.com). This project was created as a learning tool to practice making HTTP requests, handling JSON responses, and building a basic console app in Java.

## Table of Contents
- [Features](#features)
- [Get Started](#get-started)
- [Usage Example](#usage-example)
- [Environment Variables](#environment-variables)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- Real-time currency conversion using ExchangeRate API
- Simple and interactive terminal menu
- Clean and modular Java code (MVC pattern)
- HTTP client with `java.net.http.HttpClient`
- JSON parsing with Gson
- Supports custom API base URL and key via config

---

## Get Started

### Prerequisites
- Java 17+
- Maven

### Running the project

1. Clone the repository

```bash
git clone https://github.com/wesleybertipaglia/currency-converter.git
```

2. Navigate to the project directory

```bash
cd currency-converter
```

3. Create a `app.properties` file following the [app.properties.example](./src/main/resources/app.properties.example) file

4. Build the project

```bash
mvn clean install
```

5. Run the app

```bash
mvn exec:java -Dexec.mainClass="com.wesleybertipaglia.Main"
```

## Usage Example

```bash
-------------------------------------

💱 CURRENCY CONVERSION MENU

-------------------------------------

1. Convert currency
0. Exit

Choose an option: 1

Enter source currency (e.g., USD): USD
Enter target currency (e.g., EUR): BRL
Enter amount: 100

✅ 100.00 USD = 505.76 BRL
```

## Contributing

Contributions are welcome! If you have any suggestions or improvements, please open an issue or a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
