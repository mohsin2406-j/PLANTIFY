package nimoinfo.nify.plantify.ui.utils

import android.content.Context
import android.widget.Toast

object CustomeDialog {
    fun showToastMessage(context: Context, message: String) {
        Toast.makeText(
            context, message,
            Toast.LENGTH_SHORT
        ).show()
    }
}