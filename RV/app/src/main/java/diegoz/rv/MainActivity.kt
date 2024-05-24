package diegoz.rv

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var ettitulo: EditText
    lateinit var etmensaje: EditText
    lateinit var btnguardar: Button
    lateinit var listaTareas: RecyclerView
    lateinit var adapter: TareasAdapter
    
    private val TareasViewModel:TareasViewModel by viewModels()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ettitulo = findViewById(R.id.ettitulo)
        etmensaje = findViewById(R.id.etmensaje)
        btnguardar = findViewById(R.id.btnguardar)
        listaTareas = findViewById(R.id.rvtareas)

        TareasViewModel.elementos.add(
            Tarea("Tarea",
                "Descripción",
                false)
        )
        adapter = TareasAdapter(TareasViewModel.elementos)

        listaTareas.adapter = adapter
        listaTareas.layoutManager = GridLayoutManager(this,1)


        btnguardar.setOnClickListener {

            val titulo = ettitulo.text.toString()
            val mensaje = etmensaje.text.toString()

            TareasViewModel.elementos.add(Tarea(titulo,mensaje,false))

            adapter.notifyDataSetChanged()
            Toast.makeText(this,"${TareasViewModel.elementos.size}", Toast.LENGTH_SHORT).show()
        }

    }
}