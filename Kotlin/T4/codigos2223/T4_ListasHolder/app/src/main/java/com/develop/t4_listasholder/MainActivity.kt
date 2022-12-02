package com.develop.t4_listasholder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.develop.t4_listasholder.adapters.AdaptadorRecycler
import com.develop.t4_listasholder.databinding.ActivityMainBinding
import com.develop.t4_listasholder.model.Usuario

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listaUsuarios: ArrayList<Usuario>
    private lateinit var adaptadorRecycler: AdaptadorRecycler;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        instancias();
        binding.botonAgregar.setOnClickListener{
            listaUsuarios.add(Usuario("Nuevo","Nuevo","Nuevo",123));
            adaptadorRecycler.notifyItemInserted(listaUsuarios.size-1);
        }


    }

    private fun instancias() {

        listaUsuarios = ArrayList();
        listaUsuarios.add(Usuario("Borja","Martin","correo@retamar.es",38))
        listaUsuarios.add(Usuario("Jose","Martin","correo@retamar.es",34))
        listaUsuarios.add(Usuario("Pedro","Martin","correo@retamar.es",32))
        listaUsuarios.add(Usuario("Claudia","Martin","correo@retamar.es",24))

        adaptadorRecycler = AdaptadorRecycler(this,listaUsuarios)
        binding.listaRecycler.adapter = adaptadorRecycler
        /*binding.listaRecycler.layoutManager = LinearLayoutManager(applicationContext,
            LinearLayoutManager.HORIZONTAL,false)*/
        binding.listaRecycler.layoutManager = GridLayoutManager(applicationContext,
            2,GridLayoutManager.VERTICAL,
            false)


    }
}