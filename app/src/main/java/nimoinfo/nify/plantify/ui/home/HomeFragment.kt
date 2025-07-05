package nimoinfo.nify.plantify.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import nimoinfo.nify.plantify.R
import nimoinfo.nify.plantify.databinding.FragmentFirstBinding
import nimoinfo.nify.plantify.ui.adapter.ImageSlideAdapter
import nimoinfo.nify.plantify.ui.adapter.ItemAdapter
import nimoinfo.nify.plantify.ui.data.Plant
import nimoinfo.nify.plantify.ui.utils.AppHelper
import nimoinfo.nify.plantify.ui.utils.MasterDataUtils


class HomeFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var itemList: ArrayList<Plant>

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
                MasterDataUtils.Contextlist(requireContext()),
                ItemAdapter.OnClickListener { itemData, clickType ->
                })

        recyclerView.adapter = itemAdapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

}