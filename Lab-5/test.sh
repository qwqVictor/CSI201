#!/bin/bash
RED=`echo -e "\033[31m"`
GREEN=`echo -e "\033[32m"`
RESET=`echo -e "\033[0m"`
JAVA_PI=3.141592653589793
rand() {
    expr $RANDOM % 100
}
testExpr() {
    standard=`printf %.6lf $(bc <<< "1.0 * ($2)")`
    output=`printf %.6lf $3`
    if [ "$standard" = "$output" ]; then
        echo "$GREEN[Success]$RESET$ENDL Test $1 passed."
    else
        echo "$RED[Failure]$RESET$ENDL Test $1 not passed. output is $output, standard is $standard."
    fi
}
execute() {
    echo -e "$1\n$2\nY\n" | java Geometry | tail -n 2 | head -n 1 | rev | cut -d ' ' -f 1 | rev
}
circleAreaTest() {
    RADIUS="$(rand)"
    testExpr circleArea "$JAVA_PI * $RADIUS * $RADIUS" "$(execute 1 $RADIUS)"
}
rectangleAreaTest() {
    LENGTH="$(rand)"
    WIDTH="$(rand)"
    testExpr rectangleArea "$LENGTH * $WIDTH" "$(execute 2 $LENGTH\\n$WIDTH)"
}
triangleAreaTest() {
    BASE="$(rand)"
    HEIGHT="$(rand)"
    testExpr triangleArea "0.5 * $BASE * $HEIGHT" "$(execute 3 $BASE\\n$HEIGHT)"
}
circleCircumferenceTest() {
    RADIUS="$(rand)"
    testExpr circleCircumference "2 * $JAVA_PI * $RADIUS" "$(execute 4 $RADIUS)"
}
rectanglePerimeterTest() {
    LENGTH="$(rand)"
    WIDTH="$(rand)"
    testExpr rectanglePerimeter "2 * ($LENGTH + $WIDTH)" "$(execute 5 $LENGTH\\n$WIDTH)"
}
trianglePerimeterTest() {
    SIDE1="$(rand)"
    SIDE2="$(rand)"
    SIDE3="$(rand)"
    testExpr trianglePerimeter "$SIDE1 + $SIDE2 + $SIDE3" "$(execute 6 $SIDE1\\n$SIDE2\\n$SIDE3)"
}
circleAreaTest
rectangleAreaTest
triangleAreaTest
circleCircumferenceTest
rectanglePerimeterTest
trianglePerimeterTest
