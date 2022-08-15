fun main() {
    val list1 = arrayListOf("Sato", "Suzuki", "Tanaka", "Honda")
    println(list1[0])
    println(list1[1])
    println(list1[2])
    println(list1[3])

    /*
文字列などを取り出し可能な箱に格納する変数
arrayListOf以外も存在する

インデックスは前から0, 1, 2, 3...となる

複数の配列を統合可能
一層の配列を1次元配列
二層の配列を2次元配列
三層の配列を3次元配列
などとよぶ

以下2次元配列の例
 */

    val list2 = arrayListOf("Kota", "Hikari", "Mei", "Yuta")
    val marged_list = arrayListOf(list1, list2)
    println(marged_list[0][0])
    println(marged_list[0][1])
    println(marged_list[0][2])
    println(marged_list[0][3])
    println(marged_list[1][0])
    println(marged_list[1][1])
    println(marged_list[1][2])
    println(marged_list[1][3])

}
