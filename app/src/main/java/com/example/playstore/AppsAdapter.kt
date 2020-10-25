package com.example.playstore

import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_app.view.*


class AppsAdapter(val arrayList: ArrayList<Apps>, val context: MainActivity) :
    RecyclerView.Adapter<AppsAdapter.ViewHolder>() {


    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(apps:Apps){
            itemView.tvName.text=apps.name
            itemView.tvRate.text=apps.rate
            itemView.ivApp.setImageResource(apps.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.item_app,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val dialogClickListener = DialogInterface.OnClickListener{_,which ->
            when(which){
                DialogInterface.BUTTON_POSITIVE -> Toast.makeText(context,"Instalando",Toast.LENGTH_SHORT).show()
            }
        }

        holder.bindItems(arrayList[position])
        holder.itemView.setOnClickListener{
            when(position){

                0-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Facebook")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.create()
                    builder.show()
                }

                1-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Twitter")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.create()
                    builder.show()
                }

                2-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Instagram")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.create()
                    builder.show()
                }

                3-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("WhatsApp")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.create()
                    builder.show()
                }

                4-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Messenger")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.create()
                    builder.show()
                }

                5-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Brawl Stars")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.show()
                }

                6-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Clash Royale")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.show()
                }

                7-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Netflix")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.show()
                }

                8-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Paypal")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.show()
                }

                9-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Spotify")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.show()
                }

                10-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Tik Tok")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.show()
                }

                11-> {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Discord")
                    builder.setMessage("Instalar")
                    builder.setPositiveButton("Yes", dialogClickListener)
                    builder.setNegativeButton("No", null)
                    builder.show()
                }
            }




        }


    }










}