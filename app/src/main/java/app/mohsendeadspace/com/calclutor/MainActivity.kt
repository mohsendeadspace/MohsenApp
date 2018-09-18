package app.mohsendeadspace.com.calclutor

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun btnNumbers(view: View){
            if(isNew){
                edtNumberShow.setText("")
            }
            isNew=false
        var btnselect=view as Button
        var btnselectValues:String=edtNumberShow.text.toString()
        when(btnselect.id){

            btn0.id->{
                btnselectValues+="0"
            }
            btn1.id->{
                btnselectValues+="1"
            }
            btn2.id->{
                btnselectValues+="2"
            }
            btn3.id->{
                btnselectValues+="3"
            }
            btn4.id->{
                btnselectValues+="4"
            }
            btn5.id->{
                btnselectValues+="5"
            }
            btn6.id->{
                btnselectValues+="6"
            }
            btn7.id->{
                btnselectValues+="7"
            }
            btn8.id->{
                btnselectValues+="8"
            }
            btn9.id->{
                btnselectValues+="9"
            }
            btndot.id->{
                btnselectValues+="."
            }
            btnplusormins.id->{
                btnselectValues= "-"+btnselectValues
            }
        }
        edtNumberShow.setText(btnselectValues)
    }


    var op="*"
    var oldNumber=""
    var isNew=true
    fun btnOperator(view:View){
        var btnselect=view as Button

        when(btnselect.id) {

            btndiv.id -> {
                op="/"
            }
            btnmul.id -> {
                op="*"
            }
            btnsub.id -> {
                op="-"
            }
            btnsum.id -> {
                op="+"
            }
        }
        oldNumber=edtNumberShow.text.toString()
        isNew=true
    }

    fun btnEqual(view:View){
        var newNumber=edtNumberShow.text.toString()
        var finalnumber:Double?=null
        when(op){
            "*"->{
                finalnumber=oldNumber.toDouble() * newNumber.toDouble()
            }
            "/"->{
                finalnumber=oldNumber.toDouble() / newNumber.toDouble()
            }
            "+"->{
                finalnumber=oldNumber.toDouble() + newNumber.toDouble()
            }
            "-"->{
                finalnumber=oldNumber.toDouble() - newNumber.toDouble()
            }
        }
        edtNumberShow.setText(finalnumber.toString())
        isNew=true
    }

    fun btnClean(view:View){
        edtNumberShow.setText("0")
        isNew=true

    }
    fun btnPercent(view:View){
        var number=edtNumberShow.text.toString().toDouble()/100
        edtNumberShow.setText(number.toString())
        isNew=true
    }

}
