package jp.techacademy.chiaki.myapplication

import android.util.Log

class Human: Animal , Thinkable{

    // プロパティ
    var hobby: String

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int,hobby: String): super(name, age) {
        this.hobby = hobby
    }



    // Movableインタフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest。","私は" + this.hobby + "について考える。")
    }

    // メソッド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
}