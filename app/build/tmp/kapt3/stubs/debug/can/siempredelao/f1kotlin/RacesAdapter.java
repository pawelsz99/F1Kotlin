package can.siempredelao.f1kotlin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcan/siempredelao/f1kotlin/RacesAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcan/siempredelao/f1kotlin/RacesAdapter$RaceViewHolder;", "onItemClickListener", "Lcan/siempredelao/f1kotlin/RacesAdapter$OnRaceItemClickListener;", "(Lcan/siempredelao/f1kotlin/RacesAdapter$OnRaceItemClickListener;)V", "raceList", "", "Lcan/siempredelao/f1kotlin/backend/model/Race;", "addItem", "", "races", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnRaceItemClickListener", "RaceViewHolder", "app_debug"})
public final class RacesAdapter extends android.support.v7.widget.RecyclerView.Adapter<can.siempredelao.f1kotlin.RacesAdapter.RaceViewHolder> {
    private final java.util.List<can.siempredelao.f1kotlin.backend.model.Race> raceList = null;
    private final can.siempredelao.f1kotlin.RacesAdapter.OnRaceItemClickListener onItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public can.siempredelao.f1kotlin.RacesAdapter.RaceViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.RacesAdapter.RaceViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    java.util.List<can.siempredelao.f1kotlin.backend.model.Race> races) {
    }
    
    public RacesAdapter(@org.jetbrains.annotations.NotNull()
    can.siempredelao.f1kotlin.RacesAdapter.OnRaceItemClickListener onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcan/siempredelao/f1kotlin/RacesAdapter$RaceViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "race", "Lcan/siempredelao/f1kotlin/backend/model/Race;", "onItemClickListener", "Lcan/siempredelao/f1kotlin/RacesAdapter$OnRaceItemClickListener;", "app_debug"})
    public static final class RaceViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        can.siempredelao.f1kotlin.backend.model.Race race, @org.jetbrains.annotations.NotNull()
        can.siempredelao.f1kotlin.RacesAdapter.OnRaceItemClickListener onItemClickListener) {
        }
        
        public RaceViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcan/siempredelao/f1kotlin/RacesAdapter$OnRaceItemClickListener;", "", "onRaceClick", "", "season", "", "round", "app_debug"})
    public static abstract interface OnRaceItemClickListener {
        
        public abstract void onRaceClick(@org.jetbrains.annotations.NotNull()
        java.lang.String season, @org.jetbrains.annotations.NotNull()
        java.lang.String round);
    }
}