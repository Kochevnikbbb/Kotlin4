package kg.geektech.kotlin4

import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import kg.geektech.kotlin3.bases.BaseViewModel
import kg.geektech.kotlin4.adapter.ViewPageAdapter
import kg.geektech.kotlin4.bases.BaseActivity
import kg.geektech.kotlin4.databinding.ActivityMainBinding
import kg.geektech.kotlin4.ui.PlusFragment
import kg.geektech.kotlin4.ui.SecondFragment
import kg.geektech.kotlin4.ui.ThirdFragment

const val NUM_PAGES = 3
class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {
    override fun inflateViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun initView() {
        super.initView()

        val fragments: ArrayList<Fragment> = arrayListOf(
            PlusFragment(),
            SecondFragment(),
            ThirdFragment(),
        )
        val adapter = ViewPageAdapter(fragments, this)
        binding.viewPager.adapter = adapter
    }
}