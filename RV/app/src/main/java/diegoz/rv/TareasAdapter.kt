package diegoz.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TareasAdapter(val tareas:List<Tarea>): RecyclerView.Adapter<TareasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareasViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(
            R.layout.tarea_item,
            parent,
            false)
        return TareasViewHolder(vista)
    }

    override fun getItemCount(): Int = tareas.size

    override fun onBindViewHolder(holder: TareasViewHolder, position: Int) {
        holder.tvTitulo.text = tareas[position].titulo
        holder.tvDescripcion.text = tareas[position].descripcion
    }

}