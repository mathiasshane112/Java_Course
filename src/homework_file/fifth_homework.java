package homework_file;

public class fifth_homework {
    // Question 1 - Merge Sort

    // ------------------------- first half -------------------------
    // array list = {90, 8, 7, 56, 88, 1, 25, 89, 50, 15}
    // a1 = {90, 8, 7, 56, 88}
    // a1.1 = {90, 8}
    // a1.1.1 = {8}, {90} - 1 comparison
    // a1.1.1.1 = {8, 90}

    // a1.2 = {7, 56, 88}
    // a1.2.1 = {7}, {56, 88} - 1 comparison
    // a1.2.2 = {7, 56, 88} - 2 comparisons

    // a2 = {8, 90}, {7, 56, 88}
    // a2.1 = {7, 8, 56, 88, 90} - 6 comparisons

    // ------------------------- second half -------------------------
    // a3 = {1, 25, 89, 50, 15}
    // a3.1 = {1, 25}
    // a3.2 = {1}, {25} - 1 comparison
    // a3.3 = {1, 25}

    // a4 = {89, 50, 15}
    // a4.1 = {89}, {50, 15} - 1 comparison
    // a4.2 = {89}, {15, 50} - 2 comparisons
    // a4.3 = {15, 50, 89}

    // a5 = {1, 25}, {15, 50, 89}
    // a5 = {1, 15, 25, 50, 89} - 5 comparisons

    // afinal = {1, 7, 8, 15, 25, 50, 56, 88, 89, 90} - 10 comparisons

    // total comparisons = 29

    // compare to nlog2n = 10 * 3.32 = 33.2
    // how many would selection sort take? = 10 * 9 = 90






}
