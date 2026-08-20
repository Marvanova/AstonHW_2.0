package org.example;

public class Product {
        private String name;
        private String dateOfManufacture;
        private String manufacturer;
        private String countryOfOrigin;
        private double price;
        private boolean bookingStatus;

        public Product(String name, String dateOfManufacture, String manufacturer, String countryOfOrigin, double price, boolean bookingStatus) {
            this.name = name;
            this.dateOfManufacture = dateOfManufacture;
            this.manufacturer = manufacturer;
            this.countryOfOrigin = countryOfOrigin;
            this.price = price;
            this.bookingStatus = bookingStatus;
        }

    public void displayInfo() {
            System.out.println(name);
            System.out.println(dateOfManufacture);
            System.out.println(manufacturer);
            System.out.println(countryOfOrigin);
            System.out.println(price);
            System.out.println(bookingStatus);
        }
}

//название, дата производства, производитель, страна происхождения,
// цена, состояние бронирования покупателем