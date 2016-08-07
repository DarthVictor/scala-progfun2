import streams._

class StringParserTerrainTest extends StringParserTerrain {
  val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin
}
val test = new StringParserTerrainTest

test.terrainFunction(Pos(4,7))