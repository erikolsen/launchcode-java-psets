class Mario
  MARK = "#"
  SPACE = ' '
  attr_accessor :height
  def initialize(h)
    @height = h.to_i
  end

  def spaces(row)
    SPACE * (height - row) 
  end

  def hashes(row)
    MARK * (row + 2) 
  end

  def print_row(n)
    puts spaces(n) + hashes(n)
  end

  def build
    step = 0
    while step < height 
      print_row(step)
      step +=1
    end
  end
end


height = 0
until height.to_i > 0 && height.to_i < 23
  print "Please enter a height "
  height = gets.chomp
  m = Mario.new(height) 
end

m.build