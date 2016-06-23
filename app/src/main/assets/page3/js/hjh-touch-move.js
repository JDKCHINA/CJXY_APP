/*
 * $.fn.hjhTouch
 * @extends jQuery
 * @anthor 迦若
 * @version 1.0
 * @date 2014-6-19
 * @example
 * $("#test").hjhTouch({width: 100, height: 100});
 * */

 (function($){
    $.fn.hjhTouch = function(options){
        var sets = $.extend({}, $.fn.hjhTouch.defaults, options);
        return this.each(function(){
            var $this = $(this),
                $par = $this.find(".tab-con"),
                $num = $this.find(".tab-num"),
                $box = $par.children("li"),
                start, method, setName,
                maxL = $box.size(),
                $i = parseInt($par.attr("data-num")),
                $imgW = $par.find("img").width(),
                $imgH = $par.find("img").height(),
                $winW = $(window).width(),
                $winH = $(window).height();

            $this.css({ width: $winW, height: $winW * $imgH / $imgW });
            method = {
                left: function(dist){
                    var $cur = $this.find(".tab-con li.cur");
                    if(Math.abs(dist) > sets.touchDistance){
                        $cur.animate({left: -$winW}, sets.speed, function(){
                            $cur.removeClass("cur").css("left", 0).hide();
                            $cur.next().addClass("cur");
                            $this.find(".tab-con li").last().animate({left: 0}, sets.speed).hide();
                            $par.append($cur);
                        });
                        $cur.next().animate({left: 0}, sets.speed);
                        if($i < maxL - 1){ $i += 1; }else{ $i = 0; }
                        $num.children("li").eq($i).addClass("cur").siblings("li").removeClass("cur");
                        $par.attr("data-num", $i);
                    }else{
                        $cur.animate({left: 0}, sets.speed);
                        $cur.next().animate({left: $winW}, sets.speed, function(){
                            $cur.next().css({left: 0}).hide();
                        });
                    }
                },
                right: function(dist){
                    var $cur = $this.find(".tab-con li.cur");
                    if(Math.abs(dist) > sets.touchDistance){
                        $cur.animate({left: $winW}, sets.speed, function(){
                            $cur.removeClass("cur").css("left", 0).hide();
                            $this.find('.tab-con li').last().addClass("cur");
                            $cur.next().animate({left: 0}, sets.speed).hide();
                            $par.prepend($this.find('.tab-con li').last());
                        });
                        $this.find('.tab-con li').last().animate({left: 0}, sets.speed);
                        if($i > 0){$i -= 1;}else{$i = maxL - 1;}
                        $num.children("li").eq($i).addClass("cur").siblings("li").removeClass("cur");
                        $par.attr("data-num", $i);
                    }else{
                        $cur.animate({left: 0}, sets.speed);
                        $this.find('.tab-con li').last().animate({left: -$winW}, sets.speed);
                    }
                },
                timeScroll: function(){
                    var $cur = $this.find(".tab-con li.cur");
                    $cur.next().css({left: $winW}).show();
                    $cur.animate({left: -$winW}, sets.speed, function(){
                        $cur.removeClass("cur").css("left", 0).hide();
                        $cur.next().addClass("cur");
                        $par.append($cur);
                    });
                    $cur.next().animate({left: 0}, sets.speed);
                    if($i < maxL - 1){ $i += 1; }else{ $i = 0; }
                    $num.children("li").eq($i).addClass("cur").siblings("li").removeClass("cur");
                    $par.attr("data-num", $i);
                    setName = setTimeout(function(){
                        method.timeScroll();
                    }, sets.autoTime);
                }
            };
            $box.on({
                "movestart": function(e){
                    if ((e.targetTouches && e.targetTouches.length > 1) || (e.distY != 0 && Math.abs(e.distY) > 5) || $box.is(":animated")) {
                        e.preventDefault();
                        return;
                    }
                    clearTimeout(setName);
                    start = {x: 0};
                },
                "move": function(e){
                    var $cur = $par.find("li.cur");
                    $cur.css({left: start.x + e.distX});
                    $cur.next().show().css({left: $winW + e.distX});
                    $this.find(".tab-con li").last().show().css({left: -$winW + e.distX});
                },
                "moveend": function(e){
                    if(e.distX < 0){//向左
                        method.left(e.distX);
                    }
                    if(e.distX > 0){//向右
                        method.right(e.distX);
                    }
                    setName = setTimeout(function(){
                        method.timeScroll();
                    }, sets.autoTime);
                }
            });
            if(sets.automatic){
                setName = setTimeout(function(){
                    method.timeScroll();
                }, sets.autoTime);
            }
        });
    }
    $.fn.hjhTouch.defaults = {
        width: 'auto',
        height: 'auto',
        speed: 200,
        touchDistance: 50,
        automatic: true,
        autoTime: 5000
    };
    $.fn.hjhTouch.version = 1.0; //版本号
})(jQuery);

