package kg.geektech.kotlin4.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.geektech.kotlin4.NUM_PAGES
import kg.geektech.kotlin4.ui.PlusFragment
import kg.geektech.kotlin4.ui.SecondFragment
import kg.geektech.kotlin4.ui.ThirdFragment

class ViewPageAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = NUM_PAGES


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                PlusFragment()
            }
            1 -> {
                SecondFragment()
            }
            else -> {
                ThirdFragment()
            }
        }
    }
 /*   (val item: ArrayList<Fragment>, activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {
        override fun getItemCount(): Int {
            return item.size
        }

        override fun createFragment(position: Int): Fragment {
            return item[position]
        }

    }*/
}