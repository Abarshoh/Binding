package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import uz.itschool.myapplication.databinding.ActivityMainBinding
import uz.itschool.myapplication.databinding.UserActivityBinding

class MainActivity : AppCompatActivity() {
    private var users = mutableListOf<User>()
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       users.add(User("Akbar","990091614","12345"))
       users.add(User("Akbar","990091615","12345"))
       users.add(User("Akbar","990091616","12345"))
       users.add(User("Akbar","990091617","12345"))
       users.add(User("Akbar","990091618","12345"))
       users.add(User("Akbar","990091618","12345"))
       users.add(User("Akbar","990091618","12345"))
       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))
//       users.add(User("Akbar","990091618","12345"))

        for (i in 0 until users.size){
            val itemUserBinding = UserActivityBinding.inflate(layoutInflater)
            itemUserBinding.name.text = users[i].name
            itemUserBinding.phone.text = users[i].phone
            itemUserBinding.login.text = users[i].login

            itemUserBinding.root.setOnClickListener {
                Toast.makeText(this,itemUserBinding.name.text.toString(),Toast.LENGTH_LONG).show()
            }
            binding.main.addView(itemUserBinding.root)
        }

    }
}


