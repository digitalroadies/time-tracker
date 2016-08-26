package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * Remove method
     * @param int size for entries
     * /
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * Size method
     * @param int size for entries
     * /

    public int size() {
        return entries.size();
    }

    /**
     * Get method
     * @param int size for entries
     * /
    public TimeEntry get(int index) {
        return entries.get(index);
    }
}

