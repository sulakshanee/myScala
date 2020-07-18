object Assignment4{
  
	def main(args: Array[String]){
		
		val Encrypt = (c:Char, key:Int, alph:String) => alph((alph.indexOf(c.toUpper)+key)%alph.size)

		val Decrypt = (c:Char, key:Int, alph:String) => {
			if((alph.indexOf(c.toUpper)-key) < 0)
				alph((alph.indexOf(c.toUpper)-key+alph.size)%alph.size)
			else
				alph((alph.indexOf(c.toUpper)-key)%alph.size)
		}

		val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,alph:String) => s.map(algo(_,key,alph))

		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		val s = "HelloUCSC"
		
		val ct=cipher(Encrypt,s,6,alphabet)
		val pt=cipher(Decrypt,ct,6,alphabet)

		println(ct)
		println(pt)

	}
}