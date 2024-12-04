package org.task.enums_optinals;

public record Person(int id,
                     String name,
                     DaysOfWeek favoriteDay,
                     Gender gender) {
}
