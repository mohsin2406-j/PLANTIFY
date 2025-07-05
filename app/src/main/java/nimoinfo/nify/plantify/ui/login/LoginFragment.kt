package nimoinfo.nify.plantify.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import nimoinfo.nify.plantify.R
import nimoinfo.nify.plantify.databinding.FragmentLoginBinding
import nimoinfo.nify.plantify.ui.home.HomeMainActivity
import nimoinfo.nify.plantify.ui.utils.CustomeDialog
import nimoinfo.nify.plantify.ui.utils.PreferenceHelper
import kotlin.jvm.java

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonLogin.setOnClickListener {
            val userEmail = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()
            if (userEmail == "admin@gmail.com" && password == "123") {
                PreferenceHelper.setUserEmail(requireContext(),userEmail)
                startActivity(Intent(requireContext(), HomeMainActivity::class.java))
            } else {
                CustomeDialog.showToastMessage(requireContext(),"Enter Email And Password")
            }
        }


        binding.Signup.setOnClickListener {
            findNavController().navigate(R.id.SignUpFragment)
        }
    }
}

/*Toast.makeText(
requireContext(),
"Enter valid UserName & password",
Toast.LENGTH_SHORT
).show()*/