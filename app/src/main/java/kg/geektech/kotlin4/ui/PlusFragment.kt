package kg.geektech.kotlin4.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kg.geektech.kotlin3.bases.BaseViewModel
import kg.geektech.kotlin4.MyViewModel
import kg.geektech.kotlin4.R
import kg.geektech.kotlin4.bases.BaseFragment
import kg.geektech.kotlin4.databinding.FragmentPlusBinding


class PlusFragment : BaseFragment<FragmentPlusBinding, MyViewModel>() {
    override fun inflateViewBinding(inflater: LayoutInflater): FragmentPlusBinding {
        return FragmentPlusBinding.inflate(inflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnPlus.setOnClickListener {
            viewModel.onIncrementClick()
        }
        binding.btnMinus.setOnClickListener {
            viewModel.onDecrementClick()
        }
    }

}