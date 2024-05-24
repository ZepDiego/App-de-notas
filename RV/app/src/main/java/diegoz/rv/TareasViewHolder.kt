package diegoz.rv

import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class TareasViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
    val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
    val tvDescripcion = itemView.findViewById<TextView>(R.id.tvDescripcion)
}