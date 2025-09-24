📌 Struktur Folder
PBO_P_05/
 ├── Case1/        # Exercise 3.1 Case 1 (Employee Sortable)
 │    ├── Sortable.java
 │    ├── Employee.java
 │    ├── Manager.java
 │    └── EmployeeTest.java
 │
 ├── Case2/        # Exercise 3.1 Case 2 (Manager Sortable)
 │    ├── Sortable.java
 │    ├── Employee.java
 │    ├── Manager.java
 │    └── ManagerTest.java
 │
 └── GoodsApp/     # Soal Interface (Goods, Food, Toy, Book)
      ├── Taxable.java
      ├── Goods.java
      ├── Food.java
      ├── Toy.java
      ├── Book.java
      └── TestGoods.java

📌 Penjelasan Singkat

Case1

Employee dibuat extends Sortable agar bisa diurutkan berdasarkan salary.

EmployeeTest.java menguji array Employee[] yang berisi Employee dan Manager.

Case2

Karena Manager extends Employee, otomatis juga Sortable.

ManagerTest.java menguji array Manager[] saja, lalu diurutkan.

GoodsApp

Goods sebagai superclass.

Food, Toy, Book extends Goods dan implement Taxable.

Pajak: Food 5%, Toy 10%, Book 0%.

TestGoods.java menampilkan perhitungan pajak.

📌 Cara Compile & Run

Masuk ke folder sesuai tugas, lalu jalankan perintah berikut:

Case1
cd Case1
javac *.java
java EmployeeTest

Case2
cd ../Case2
javac *.java
java ManagerTest

GoodsApp
cd ../GoodsApp
javac *.java
java TestGoods
