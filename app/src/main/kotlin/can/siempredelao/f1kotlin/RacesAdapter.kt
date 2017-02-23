package can.siempredelao.f1kotlin

import android.support.annotation.StringRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import can.siempredelao.f1kotlin.backend.Race
import kotlinx.android.synthetic.main.view_race_item.view.*
import java.util.ArrayList

class RacesAdapter(val onItemClickListener: OnRaceItemClickListener) : RecyclerView.Adapter<RacesAdapter.RaceViewHolder>() {

    private var raceList: MutableList<Race> = ArrayList<Race>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RacesAdapter.RaceViewHolder(parent.inflate(R.layout.view_race_item))

    override fun onBindViewHolder(holder: RacesAdapter.RaceViewHolder, position: Int) = holder.bind(raceList[position], onItemClickListener)

    override fun getItemCount(): Int = raceList.size

    fun addItem(race: Race) {
        raceList.add(race)
        notifyItemInserted(itemCount)
    }

    class RaceViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(race: Race, onItemClickListener: OnRaceItemClickListener) {
            with(itemView) {
                tvRace.text = race.raceName
                setOnClickListener { onItemClickListener.onRaceClick(race.season, race.round) }
            }
        }
    }

    fun ViewGroup.inflate(@StringRes layoutRes: Int): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, false)
    }

    fun <T : RecyclerView.ViewHolder> T.onClick(event: (view: View, position: Int, type: Int) -> Unit): T {
        itemView.setOnClickListener {
            event.invoke(it, getAdapterPosition(), getItemViewType())
        }
        return this
    }

    interface OnRaceItemClickListener {
        fun onRaceClick(season: String, round: String)
    }
}
