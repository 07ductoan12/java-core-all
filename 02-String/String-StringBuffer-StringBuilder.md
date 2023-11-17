# String - StringBuffer - StringBuilder

```Java``` cung cấp 3 lớp để biểu diễn chuỗi: ```String, StringBuffer, StringBuilder```.
```String``` là lớp bất biến trong khi ```StringBuffer và StringBuilder``` có thể thay đổi được.

## Khác biệt giữa String và StringBuffer

| No  | String                                                                                                                                                                                 | StringBuffer                                                                                         |
| --- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| 1   | ```String``` là immutable (Bất biến)                                                                                                                                                   | ```StringBuffer``` là mutable ( Có thể thay đổi )                                                    |
| 2   | Khi sử dụng ```String``` chậm và tốn nhiều bộ nhớ hơn khi nối quá nhiều chuỗi (mỗi lần nối chuỗi tương đương với việc khởi tạo liên tục và nối 2 xâu lại rồi trả về đuối tượng String) | ```StringBuffer``` cho phép thao tác trên một đối tượng duy nhất và thay đổi được nội dung trong nó. |
| 3   | String class ghi đè phương thức ```equals()``` của ```Object class``` =>  có thể so sánh 2 chuỗi bằng phương thức ```Equals()```                                                       | ```StringBuffer``` không ghi đè phương thức ```Equals()``` của ```Object class```                    |
| 4   | ```String class``` chậm hơn khi thực hiện thao tác nối chuỗi                                                                                                                           | ```StringBuffer class``` nhanh hơn trong khi thực hiện các thao tác nối.                             |
| 5   | ```String class``` ở String pool (một phần riêng biệt trong ```Heap memory```)                                                                                                         | ```StringBuffer``` sử dụng ```Heap memory```                                                         |

## StringBuffer - StringBuilder

| No  | StringBuffer                                                                                                                                                           | StringBuilder                                                                                                                          |
| --- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| 1   | ```StringBuffer``` được synchronized (đồng bộ hóa) - tức luồng được an toàn. => Có nghĩa là 2 luồng không thể gọi các phương thức của ```StringBuffer``` cùng một lúc. | ```StringBuilder``` non-synchronized (không được đồng bộ hóa). => 2 luồng có thể gọi đồng thời các phương thức của ```StringBuilder``` |
| 2   | ```StringBuffer``` kém hiệu quả hơn ```StringBuilder```                                                                                                                | ```StringBuilder``` hiệu quả hơn ```StringBuffer```                                                                                    |