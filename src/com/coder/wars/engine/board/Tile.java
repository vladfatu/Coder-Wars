package com.coder.wars.engine.board;

import com.coder.wars.engine.units.ExpendableUnit;
import com.coder.wars.engine.units.PlayableUnit;
import com.coder.wars.engine.units.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vlad on 24.12.2014.
 */
public class Tile {

    private List<Unit> units;

    public List<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit) {
        if (this.units == null)
        {
            this.units = new ArrayList<Unit>();
        }
        this.units.add(unit);
    }

    public List<Unit> getExpendableUnits()
    {
        if (this.units == null)
        {
            return null;
        }
        List<Unit> expendableUnits = new ArrayList<Unit>();
        for (Unit unit : this.units)
        {
            if (unit instanceof ExpendableUnit)
            {
                expendableUnits.add(unit);
            }
        }
        return expendableUnits;
    }

    public List<Unit> getPlayableUnits()
    {
        if (this.units == null)
        {
            return null;
        }
        List<Unit> playableUnits = new ArrayList<Unit>();
        for (Unit unit : this.units)
        {
            if (unit instanceof PlayableUnit)
            {
                playableUnits.add(unit);
            }
        }
        return playableUnits;
    }
}
