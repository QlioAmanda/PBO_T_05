## Struktur Folder
- `PBO_P_05/Case1/` → Exercise 3.1 (Employee Sortable)  
- `PBO_P_05/Case2/` → Exercise 3.1 (Manager Sortable)  
- `PBO_P_05/GoodsApp/` → Soal Interface (Goods, Food, Toy, Book)  

## Deskripsi
- **Case1** → `Employee` dibuat `Sortable`, diuji dengan `EmployeeTest`.
- **Case2** → `Manager` otomatis `Sortable`, diuji dengan `ManagerTest`.
- **GoodsApp** → `Goods` superclass, `Food`, `Toy`, `Book` implement `Taxable`.

## Cara Menjalankan
Masuk ke folder lalu compile & run:

```sh
cd Case1
javac *.java
java EmployeeTest

cd ../Case2
javac *.java
java ManagerTest

cd ../GoodsApp
javac *.java
java TestGoods