package kg.geektech.kotlin4.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.geektech.kotlin3.bases.BaseViewModel
import kg.geektech.kotlin4.MyViewModel
import kg.geektech.kotlin4.R
import kg.geektech.kotlin4.bases.BaseFragment
import kg.geektech.kotlin4.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding,MyViewModel>() {
    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.counter.observe(requireActivity()) {
            binding.tvSecondFragment.text = it.toString()
        }
    }

}