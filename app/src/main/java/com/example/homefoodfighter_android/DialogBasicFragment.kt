package com.example.homefoodfighter_android

import android.R.attr.dialogMessage
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.homefoodfighter_android.databinding.FragmentDialogBasicBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DialogBasicFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DialogBasicFragment : DialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //false로 설정해 주면 화면밖 혹은 뒤로가기 버튼시 다이얼로그라 dismiss 되지 않는다.
        isCancelable = true
    }

    private lateinit var binding: FragmentDialogBasicBinding
    var content= "text"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDialogBasicBinding.inflate(inflater, container, false)
        val bundle = arguments
        if (bundle != null) {
            content = bundle.getString("content").toString()
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtContent.text=content
        binding.btnConfirm.setOnClickListener {
            //종료
            Toast.makeText(context,"sasdfs", Toast.LENGTH_LONG).show()
            dismiss()
        }
    }
}