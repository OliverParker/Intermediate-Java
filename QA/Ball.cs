using System.Drawing;

namespace QA
{
    public interface IMovable
    {
        void Move();
    }
    public class Ball : IMovable
    {
        public Rectangle rectangle;
        public World world;
        public Point dir;
        public Color colour;
        public Ball(Rectangle rectangle, Point dir, World world, Color colour)
        {
            this.rectangle = rectangle;
            this.dir = dir;
            this.colour = colour;
            this.world = world;
        }
        public virtual void Move()
        {
            rectangle.Offset(dir);

            if (rectangle.Left < 0 || rectangle.Right > world.rectangle.Width) {
                dir.X = -dir.X;
                rectangle.Offset(dir);
            }
            if (rectangle.Top < 0 || rectangle.Bottom > world.rectangle.Height)
            {
                dir.Y = -dir.Y;
                rectangle.Offset(dir);
            }
        }

        public Rectangle getUniversalRectangle()
        {
            Rectangle rec = this.rectangle;
            World w = this.world;
            while (w != null)
            {
                rec.Offset(w.rectangle.X, w.rectangle.Y);
                w = w.world;
            }
            return rec;
        }
    }
}
