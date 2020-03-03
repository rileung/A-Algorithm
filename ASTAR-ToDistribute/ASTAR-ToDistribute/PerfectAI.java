import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public int hueristic()
{
  // currently for djikstras
  return 0;
}

public class PerfectAI implements
{
  /// Creates the path to the goal.
  public List<Point> createPath(final TerrainMap map)
  {

    // Holds the resulting path
    final ArrayList<Point> path = new ArrayList<Point>();

    // Keep track of where we are and add the start point.
    final Point CurrentPoint = map.getStartPoint();
    path.add(new Point(CurrentPoint));

    //
  }
  return path;
}
