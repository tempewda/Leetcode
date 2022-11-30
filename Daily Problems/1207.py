class Solution:
    def uniqueOccurrences(self, arr: List[int]):

        self.num_occur = dict()     #stores a number and its occurrences

        # create the dictionary
        for num in arr:
            if num in self.num_occur.keys():
                self.num_occur[num] += 1
            else:
                self.num_occur[num] = 1
        
        # we create a list of all the occurrences (values of dict)
        # and compare it with its corresponding set
        # to check for duplicates
        occur_list = list(self.num_occur.values())
        occur_set = set(occur_list)

        if len(occur_list) == len(occur_set):
            return True
        else:
            return False
