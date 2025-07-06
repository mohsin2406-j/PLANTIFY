package nimoinfo.nify.plantify.ui.home

import android.os.Bundle
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import nimoinfo.nify.plantify.databinding.FragmentFirstBinding
import nimoinfo.nify.plantify.ui.adapter.ImageSliderAdapter
import nimoinfo.nify.plantify.ui.adapter.ItemAdapter
import nimoinfo.nify.plantify.ui.data.Plant
import nimoinfo.nify.plantify.ui.utils.MasterDataUtils
import nimoinfo.nify.plantify.ui.utils.MasterDataUtils.viewPagerImage


class HomeFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var imageSliderAdapter: ImageSliderAdapter
    private lateinit var itemList: ArrayList<Plant>
    private lateinit var viewPager: ViewPager
    private var currentPage = 0
    private val handler = android.os.Handler(Looper.getMainLooper())
    private val delay: Long = 3000 // 3 seconds
    private val runnable: Runnable = object : Runnable {
        override fun run() {
            val totalItems = imageSliderAdapter.count
            currentPage = (currentPage + 1) % totalItems
            binding.viewPager.setCurrentItem(currentPage, true)
            handler.postDelayed(this, delay)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())


        itemAdapter =
            ItemAdapter(
                requireContext(),
                itemList = MasterDataUtils.Contextlist(requireContext()),
                ItemAdapter.OnClickListener { itemData, clickType ->
                })
        imageSliderAdapter = ImageSliderAdapter(
            requireContext(), imageList = viewPagerImage()
        )

        binding.recyclerView.adapter = itemAdapter
        binding.viewPager.adapter = imageSliderAdapter
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable, delay)
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}