package jp.techacademy.chiaki.myapplication

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
    //具体的な処理は継承先に書かせるというこｔ
}