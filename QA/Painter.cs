using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;

namespace QA
{
    public class Painter
    {
        Graphics g;
        public Painter(Graphics g)
        {
            this.g = g;
        }
        public void Cls() { g.Clear(Color.Cornsilk); }

        public void Draw(World w)
        {
            Pen pen = new Pen(w.colour);
            g.DrawRectangle(pen, w.getUniversalRectangle());
            w.balls.ForEach(b =>
                g.FillEllipse(new SolidBrush(b.colour), b.getUniversalRectangle()));
            pen.Dispose();
        }
    }
}
