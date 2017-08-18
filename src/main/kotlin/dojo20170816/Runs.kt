/**
 * Created by dehemart on 16/08/17.
 */

fun runs(a: IntArray): Int {

    var runs =  0
    a.forEachIndexed { index, i ->
        if(index != a.lastIndex && a.get(index + 1) != i){
            runs++
        }

        if(index == a.lastIndex && index > 0 && a.get(index - 1) != i){
            runs++
        }
    }

    return runs
}