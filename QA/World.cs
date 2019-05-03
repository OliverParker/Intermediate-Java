using System.Collections.Generic;
using System.Drawing;

namespace QA
{
    //public interface IDrawable
    //{
    //    void Draw(Graphics g);
    //}
    public class World : Ball
    {
        public List<Ball> balls = new List<Ball>();
        public World(Rectangle rectangle, Point dir, World world, Color colour)
            : base(rectangle, dir, world, colour)
        {
        }

        public void AddBall(Ball b)
        {
            balls.Add(b);
        }
        public void AddBall(int x, int y, int r, int xDir, int yDir,World world, Color colour)
        {
            AddBall(new Ball(new Rectangle(x, y, r*2, r*2), new Point(xDir, yDir), world,colour));
        }

        public override void Move()
        {
            base.Move();
            balls.ForEach(b => b.Move());
        }
    }
}
