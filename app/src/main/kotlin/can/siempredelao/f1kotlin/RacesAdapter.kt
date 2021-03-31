package can.siempredelao.f1kotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import can.siempredelao.f1kotlin.backend.model.Race
import kotlinx.android.synthetic.main.view_race_item.view.*

class RacesAdapter(private val onItemClickListener: OnRaceItemClickListener) : RecyclerView.Adapter<RacesAdapter.RaceViewHolder>() {

    private val raceList = mutableListOf<Race>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RacesAdapter.RaceViewHolder(parent.inflate(R.layout.view_race_item))

    override fun onBindViewHolder(holder: RacesAdapter.RaceViewHolder, position: Int) = holder.bind(raceList[position], onItemClickListener)

    override fun getItemCount(): Int = raceList.size

    fun addItem(races: List<Race>) {
        raceList.addAll(races)
        notifyItemInserted(itemCount)
    }

    class RaceViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(race: Race, onItemClickListener: OnRaceItemClickListener) {
            with(itemView) {
                this.tvRace.text = race.raceName
                setOnClickListener { onItemClickListener.onRaceClick(race.season, race.round) }
            }
        }
    }

    interface OnRaceItemClickListener {
        // TODO convert to a position based listener and move to onCreateViewHolder to avoid unnecessary memory allocations
        fun onRaceClick(season: String, round: String)
    }
}
