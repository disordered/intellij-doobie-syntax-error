import doobie.implicits.toSqlInterpolator
import doobie.implicits.legacy.instant.given

import java.time.Instant

object Test {
  def test(time: Instant) =
    sql"select * from somewhere where time = $time"
}
