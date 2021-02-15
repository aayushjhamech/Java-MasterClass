package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Schedule s = new Schedule();
//        s.addClass("Maths", 1600, 1800);
//        s.addClass("Computer Science", 1200, 1300);
//        s.addClass("Physics", 1230, 1400);
//        s.addClass("Chemistry", 1400, 1630);
                System.out.println("maximum classes: " + s.getMaxSchedule());

        }

        }
}


class Schedule {

    List<StudentClass> _classes = new LinkedList<>();

    public void addClass(String name, int startTime, int endTime) {
        _classes.add(new StudentClass(name, startTime, endTime));
    }

    private int getMaxSchedule(int index, Collection<StudentClass> selected) {
        // check if we reached the end of the array
        if (index >= _classes.size()) {
            return 0;
        }

        StudentClass current = _classes.get(index);

        // check if taking this class doesn't conflict with the
        // previously-selected set of classes
        boolean canTakeThisClass = true;
        for (StudentClass other : selected) {
            if (current.overlapsWith(other)) {
                canTakeThisClass = false;
                break;
            }
        }

        // check best schedule if we don't take this class
        int best = getMaxSchedule(index + 1, selected);

        // check best schedule if we take this class (if such is possible)
        if (canTakeThisClass) {
            selected.add(current);
            best = Math.max(best, 1 + getMaxSchedule(index + 1, selected));
            selected.remove(current);
        }

        return best;
    }

    public int getMaxSchedule() {
        Collection<StudentClass> selected = new ArrayList<>();
        return getMaxSchedule(0, selected);
    }
}

class StudentClass {
    public int _start;
    public int _end;
    public String _name;
    public StudentClass(String name, int start, int end) {
        _name = name;
        _start = start;
        _end = end;
    }
    public boolean overlapsWith(StudentClass other) {
        return _start < other._end && _end > other._start;
    }
    public String toString() {
        return "[" + _start + " - " + _end + "] " + _name;
    }
}