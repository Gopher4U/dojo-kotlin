/**
 * Created by dehemart on 16/08/17.
 */
package maxindex

object MaxOf {
    fun indexOfMax(a: IntArray): Int? {
        return a.max()?.let { a.lastIndexOf(it) }

    }
}
