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
import kg.geektech.kotlin4.databinding.FragmentThirdBinding

class ThirdFragment : BaseFragment<FragmentThirdBinding, MyViewModel>() {
    override fun inflateViewBinding(inflater: LayoutInflater): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(inflater)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.storyLiveData.observe(requireActivity()) {
            it.forEach { value ->
                binding.tvThirdFragment.append(value)
            }
        }
    }
}